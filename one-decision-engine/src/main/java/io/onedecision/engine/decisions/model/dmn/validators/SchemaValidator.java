/*******************************************************************************
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.onedecision.engine.decisions.model.dmn.validators;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SchemaValidator implements ErrorHandler {

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(SchemaValidator.class);

    class LocalResourceResolver implements LSResourceResolver {
        @Override
        public LSInput resolveResource(String type, String namespaceURI,
                String publicId, String systemId, String baseURI) {
            DOMImplementationRegistry registry;
            try {
                registry = DOMImplementationRegistry.newInstance();
            } catch (Exception e) {
                return null;
            }
            DOMImplementationLS domImplementationLS = (DOMImplementationLS) registry
                    .getDOMImplementation("LS");
            LSInput ret = domImplementationLS.createLSInput();

            InputStream is = null;
            try {
                is = getResourceAsStreamWrapper("schema/" + systemId);
            } catch (Exception e) {
                System.err.println(e.toString());
            }

            ret.setSystemId(systemId);
            ret.setByteStream(is);
            return ret;
        }
    }

    private List<Exception> errors = new ArrayList<Exception>();

    private InputStream getResourceAsStreamWrapper(String name) {
        InputStream is = getClass().getResourceAsStream(name);
        if (is == null)
            is = getClass().getResourceAsStream("/" + name);
        return is;
    }

	public void validate(InputStream obj, Errors errors) {
        InputStream is = (InputStream) obj;

        SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        schemaFactory.setResourceResolver(new LocalResourceResolver());

        try {
            schemaFactory.newSchema(new StreamSource(
                    getResourceAsStreamWrapper("schema/dmn.xsd")));
        } catch (SAXException e1) {
            errors.reject("Cannot find / read schema",
                    "Exception: " + e1.getMessage());
        }

        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        // parserFactory.setValidating(true);
        parserFactory.setNamespaceAware(true);
        // parserFactory.setSchema(schema);

        SAXParser parser = null;
        try {
            parser = parserFactory.newSAXParser();
            XMLReader reader = parser.getXMLReader();
            reader.setErrorHandler(this);

            try {
                parser.parse(new InputSource(is), (DefaultHandler) null);
            } catch (Exception e) {
                String msg = "Schema validation failed";
                LOGGER.error(msg, e);
                errors.reject(msg, "Exception: " + e.getMessage());
            }
            if (this.errors.size() > 0) {
                errors.reject("Schema validation failed",
                        this.errors.toString());
            }
        } catch (ParserConfigurationException e1) {
            errors.reject("Cannot create parser",
                    "Exception: " + e1.getMessage());
        } catch (SAXException e1) {
            errors.reject("Parser cannot be created",
                    "Exception: " + e1.getMessage());
        }
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        errors.add(exception);
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        errors.add(exception);
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        errors.add(exception);
    }
}

/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.example.junit;

import junit.framework.TestCase;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * created Aug 12, 2004 1:39:59 PM
 */

public class XmlParserTest extends TestCase {

    public XmlParserTest(String s) {
        super(s);
    }

    public void testXercesIsPresent() throws SAXException {
        XMLReader xerces;
        xerces = XMLReaderFactory.createXMLReader(
                        "org.apache.xerces.parsers.SAXParser");
        assertNotNull(xerces);
    }

    public void testXercesHandlesSchema() throws SAXException {
        XMLReader xerces;
        xerces = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
        xerces.setFeature("http://apache.org/xml/features/validation/schema",
                true);
    }

    public void testParserHandlesSchema() throws SAXException {
        XMLReader xerces;
        xerces = XMLReaderFactory.createXMLReader();
        xerces.setFeature("http://apache.org/xml/features/validation/schema",
                true);
    }

}

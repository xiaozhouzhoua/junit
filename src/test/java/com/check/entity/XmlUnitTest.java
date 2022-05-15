package com.check.entity;

import org.junit.jupiter.api.Test;
import org.xmlunit.assertj.XmlAssert;

public class XmlUnitTest {
    @Test
    public void xml_check() {
        XmlAssert.assertThat("""
               <a>
                   <b attr="b"></b>
               </a>
        """).nodesByXPath("//a/b/@attr")
        .exist();
    }
}

package com.check.entity;

import com.check.utils.ResourceUtil;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.xmlunit.assertj.XmlAssert;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FactoryTest {
    @TestFactory
    Collection<DynamicTest> dynamicTestsCreatedThroughCode() {
        List<Xml> xmls = ResourceUtil.getXMLs("user.*\\.xml");

        return xmls.stream().map(xml -> DynamicTest.dynamicTest(xml.getName(), () -> {
            XmlAssert.assertThat(xml.getContent()).hasXPath("/users/user/name");
        })).collect(Collectors.toList());
    }
}

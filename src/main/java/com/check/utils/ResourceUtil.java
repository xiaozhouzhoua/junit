package com.check.utils;

import com.check.entity.Xml;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.Resource;
import io.github.classgraph.ScanResult;

public class ResourceUtil {
    public static List<Xml> getXMLs(String pattern)  {
        List<Xml> xmlList = new ArrayList<>();

        try (ScanResult scanResult = new ClassGraph().scan()) {
            scanResult.getResourcesMatchingPattern(Pattern.compile(pattern))
                    .forEachByteArrayIgnoringIOException((Resource res, byte[] fileContent) ->
                            xmlList.add(new Xml(res.getPath(), new String(fileContent, StandardCharsets.UTF_8))));
        }

        return xmlList;
    }
}

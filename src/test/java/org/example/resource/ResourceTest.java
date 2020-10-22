package org.example.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

public class ResourceTest {
    @Test
    public void test001(){
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("bean*.xml");
        Resource resource = ctx.getResource("beans.xml");
    }
    @Test
    public void urlResourceTest() throws IOException {
        // 创建一个 Resource 对象，指定从文件系统里读取资源
        UrlResource urlResource = new UrlResource("file:beans.xml");
        // 获取该资源的简单信息
        System.out.println(urlResource.getInputStream());
        System.out.println(urlResource.getFilename());
        System.out.println(urlResource.getDescription());
        System.out.println(urlResource.getURL());
    }

    @Test
    public void classPathResourceTest() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("beans.xml");
        // 获取该资源的简单信息
        System.out.println(classPathResource.getInputStream());
        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());
    }

    /**
     * 很多的时候它都是隐式创建的，执行 Spring 的某个方法时，该方法接受一个代表资源路径的字符串参数，
     * 当 Spring 识别该字符串参数中包含 file: 前缀后，系统将会自动创建 FileSystemResource 对象。
     */
    @Test
    public void fileSystemResourceTest(){
        FileSystemResource fileSystemResource = new FileSystemResource("beans.xml");
        // 获取该资源的简单信息
        System.out.println(fileSystemResource.getFilename());
        System.out.println(fileSystemResource.getDescription());
    }
}

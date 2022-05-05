package com.wjc.maker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class MakerApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("true = " + true);
	}
	@Test
	void t1() throws TemplateException, IOException {

		String dir="C:\\Users\\28600\\IdeaProjects\\maker\\src\\main\\resources\\template";
		String target="C:\\Users\\28600\\IdeaProjects\\maker\\src\\main\\java\\com\\wjc\\maker\\test";
		Configuration conf = new Configuration();
		//加载模板文件(模板的路径)
		conf.setDirectoryForTemplateLoading(new File(dir));
		// 加载模板

		Template template = conf.getTemplate("freemarker-demo");
		// 定义数据

		Map root = new HashMap();
		root.put("world", "Hello World");
		// 定义输出
		Writer out = new FileWriter(target + "/Test.java");
		template.process(root, out);
		System.out.println("转换成功");
		out.flush();
		out.close();
	}

}

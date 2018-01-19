package com.jjshome;

import com.jjshome.controller.ConventerController;
import com.jjshome.conventer.PdfFileConventer;
import com.jjshome.dao.FileDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FileConventerApplication.class)
public class FileConventerApplicationTests {

	@Autowired
	private ConventerController conventerController;
	@Test
	public void contextLoads() {
	}



	@Test
	public void testConventer() {
		String filePath = "http://o8oy36u98.bkt.clouddn.com/%E6%96%B0%E5%BB%BA%20Microsoft%20Office%20PowerPoint%20%E6%BC%94%E7%A4%BA%E6%96%87%E7%A8%BF.pptx";
		conventerController.fileConventer(filePath);
	}

}

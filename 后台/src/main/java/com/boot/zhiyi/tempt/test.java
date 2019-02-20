package com.boot.zhiyi.tempt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test {
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	public  void error(String infomation) {
		logger.error(infomation);
	}
	public  void debug(String infomation) {
		logger.debug(infomation);
	}
	public  void info(String infomation) {
		logger.info(infomation);
	}
	public static void main(String[] args) {
		test logMain=new test();
		logMain.error("info模式测试");
	}
}

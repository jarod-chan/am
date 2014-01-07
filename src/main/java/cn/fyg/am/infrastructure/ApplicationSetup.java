package cn.fyg.am.infrastructure;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.slf4j.bridge.SLF4JBridgeHandler;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class ApplicationSetup extends GuiceServletContextListener {
	

	@Override
	protected Injector getInjector() {
		resetLogger();
		return Guice.createInjector(new MyBatis(),new Am(),new Web());
	}

	/**
	 * 使java.util.logging适配slf4j来输出日志
	 * 需要jul-to-slf4j包
	 */
	private void resetLogger() {
		LogManager.getLogManager().reset();
		SLF4JBridgeHandler.install();
		Logger.getLogger("global").setLevel(Level.FINEST);
	}
}

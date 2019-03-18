package com.tdu.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

public class MainConfig extends JFinalConfig
{
	
	static Prop p;

	static void loadConfig() 
	{
		if (p == null) 
			p = PropKit.use("demo-config-dev.txt");
	}

	@Override
	public void configConstant(Constants me) 
	{
		loadConfig();
		me.setDevMode(true);
		me.setBaseUploadPath(PathKit.getWebRootPath() + "/upload");
		me.setMaxPostSize(2147483647);
		me.setViewType(ViewType.JSP);
		me.setUrlParaSeparator("&");
		me.setError404View("/404.jsp");
	}

	@Override
	public void configRoute(Routes me) 
	{
		
	}

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

}

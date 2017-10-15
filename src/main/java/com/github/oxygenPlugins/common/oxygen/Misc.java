package com.github.oxygenPlugins.common.oxygen;

import javax.swing.JFrame;

import ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace;

public class Misc {
	
	public static JFrame getParentFrame(StandalonePluginWorkspace spw){
		return getParentFrame(spw, new JFrame());
	}
	
	public static JFrame getParentFrame(StandalonePluginWorkspace spw, JFrame defaultFrame){
		Object frameObj = spw.getParentFrame();
		if(frameObj instanceof JFrame){
			return (JFrame) frameObj;
		}
		return defaultFrame;
	}
}

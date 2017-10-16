package com.github.oxygenPlugins.common.oxygen.adapter;

import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JMenuBar;

import ro.sync.exml.workspace.api.standalone.MenuBarCustomizer;
import ro.sync.exml.workspace.api.standalone.ToolbarComponentsCustomizer;
import ro.sync.exml.workspace.api.standalone.ToolbarInfo;

public class ToolbarMenuAdapter implements ToolbarComponentsCustomizer, MenuBarCustomizer  {
	
	
	
	private AbstractButton validationBtn;

	@Override
	public void customizeMainMenu(JMenuBar menu) {
		
	}

	@Override
	public void customizeToolbar(ToolbarInfo toolbar) {
		if(toolbar.getToolbarID().equals("Validate") || toolbar.getToolbarID().equals("Validation")){
			String id = toolbar.getToolbarID();
			JComponent validationComp = toolbar.getComponents()[0];
			if(validationComp instanceof AbstractButton){
				validationBtn = (AbstractButton) validationComp;
			}
		}
	}
	
	public void validationButton(){
		if(validationBtn != null){
			for (ActionListener al : validationBtn.getActionListeners()) {
				al.actionPerformed(null);
			}
		}
	}
	
	

}

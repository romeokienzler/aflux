

/*
 * aFlux: JVM based IoT Mashup Tool
 * Copyright [2019] [Tanmaya Mahapatra]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tum.in.aflux.model;


import de.tum.in.aflux.tools.core.PropertyInputType;
import de.tum.in.aflux.tools.core.ToolProperty;
import de.tum.in.aflux.tools.core.ToolPropertyOption;
/**
 * Class to store the property definition that can be setted in each instance element
 * This structure is intended for definition. It lacks of the value of an instance
 * @author Tanmaya Mahapatra
 *
 */
public class FlowElementTypeProperty {
	
	
	String name;
	/**
	 * String representation of the value
	 */
	String initialValue;
	PropertyInputType type;
	String hint;
	String html;
	Boolean readOnly;
	ToolPropertyOption[] options;
	
	
	public String getName() {
		return name;
	}
	
	public FlowElementTypeProperty() {};
	
	public FlowElementTypeProperty(String name, String initialValue,PropertyInputType type,ToolPropertyOption[] options,String hint, String html,Boolean readOnly) {
		super();
		this.name = name;
		this.hint = hint;
		this.html = html;
		this.type = type;
		this.initialValue=initialValue;
		this.readOnly=readOnly;
		this.options=options;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}

	public String getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(String initialValue) {
		this.initialValue = initialValue;
	}
	
	
	
	public PropertyInputType getType() {
		return type;
	}
	public void setType(PropertyInputType type) {
		this.type = type;
	}
	
	

	public Boolean getReadOnly() {
		return readOnly;
	}
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	public static ToolProperty toToolProperty(FlowElementTypeProperty inputProperty) {
		ToolProperty result;
		if (inputProperty==null) {
			result=null;
		} else {
				result=new ToolProperty(inputProperty.getName(),
						inputProperty.getInitialValue(),
						inputProperty.getType(),
						inputProperty.getOptions(),
						inputProperty.getHint(),
						inputProperty.getHtml(),
						inputProperty.getReadOnly());
		}
		return result;
	}

	public ToolPropertyOption[] getOptions() {
		return options;
	}

	public void setOptions(ToolPropertyOption[] options) {
		this.options = options;
	}	
	
	

}

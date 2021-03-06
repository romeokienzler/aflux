/*
 * aFlux: JVM based IoT Mashup Tool
 * Copyright 2019 Tanmaya Mahapatra
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

public class ActivityBaseProperties {
	
	
	public static FlowElementProperty[] generate(String name) {
		FlowElementProperty[] result={
				new FlowElementProperty(FlowActivity.NAME_PROPERTY,name,name,PropertyInputType.TEXT,null,"","",false),
				new FlowElementProperty(FlowActivity.SUBFLOW_PROPERTY,"false","false",PropertyInputType.CHECKBOX,null,"","",false),
				new FlowElementProperty(FlowActivity.CATEGORY_PROPERTY,"general","general",PropertyInputType.TEXT,null,"taxonomy value to group the subflows","",false),
				new FlowElementProperty(FlowActivity.COLOR_PROPERTY,"#90CAF9","#90CAF9",PropertyInputType.TEXT,null,"visual element color background","",false)
		};
		return result;
	}
	

}

/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.fhir.swagger;

import com.wordnik.swagger.servlet.config.DefaultServletReaderConfig;
import org.apache.commons.collections.iterators.IteratorEnumeration;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by harsha on 4/13/15.
 */
public class SwaggerServlet extends DefaultServletReaderConfig {
	private static Map<String, String> params = new HashMap<String, String>();
	static {
		params.put("swagger.resource.package", "org.openmrs.module.fhir.server");
		params.put("swagger.api.basepath", "http://localhost:8080/openmrs/api-docs");
		params.put("api.version", "1.0.0");
	}

	public String getInitParameter(String name) {
		return params.get(name);
	}

	public Enumeration getInitParameterNames() {
		return new IteratorEnumeration(params.keySet().iterator());
	}
}

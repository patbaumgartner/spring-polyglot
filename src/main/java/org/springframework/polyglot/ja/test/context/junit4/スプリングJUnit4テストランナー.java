/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.polyglot.ja.test.context.junit4;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 日本語版 {@link SpringJUnit4ClassRunner}.
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
public class スプリングJUnit4テストランナー extends SpringJUnit4ClassRunner {

	public スプリングJUnit4テストランナー(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

}

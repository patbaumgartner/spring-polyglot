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

package org.springframework.polyglot.ja.test.context;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日本語版 {@link Bean} アノテーション
 *
 * @author Tadaya Tsuyukubo
 * @since 1.0
 */
@Bean
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ビーン {

	@AliasFor(annotation = Bean.class, attribute = "name")
	String[] 名前() default {};

	@AliasFor(annotation = Bean.class, attribute = "autowire")
	Autowire オートワイヤリング() default Autowire.NO;

	@AliasFor(annotation = Bean.class, attribute = "initMethod")
	String 初期化メソッド() default "";

	@AliasFor(annotation = Bean.class, attribute = "destroyMethod")
	String 終了処理メソッド() default AbstractBeanDefinition.INFER_METHOD;

}

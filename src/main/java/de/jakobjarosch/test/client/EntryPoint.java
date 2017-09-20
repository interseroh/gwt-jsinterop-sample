/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.jakobjarosch.test.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

    private Foo foo;

    @Override
    public void onModuleLoad() {
        Button button = new Button("Calculate me!");
        RootPanel rootPanel = RootPanel.get("buttonFoo");
        rootPanel.add(button);

        button.addClickHandler(clickEvent -> createFoo());
    }

    private void createFoo() {
        if (foo == null) {
            // For the first time 42 because of the default value in JS
            foo = new Foo();

            final int sum = foo.sum();
            Window.alert(Integer.toString(sum));
        } else {
            // Second time and next time 20
            foo.x = 10;
            foo.y = 10;

            final int sum = foo.sum();
            Window.alert(Integer.toString(sum));
        }
    }
}

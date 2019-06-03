/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.iri.impl;

abstract public class SchemeSpecificPart {

//    public static final SchemeSpecificPart NoSchemeSpecificPart = null;

    public SchemeSpecificPart() {
        super();
    }

    abstract public void analyse(Parser parser, int range);

    abstract void usedBy(Parser parser);
//    public long getErrors() {
//        return 0;
//    }

    abstract public long getMask(boolean includeWarnings);

    abstract public int getRequired();

    abstract public int getProhibited();

    abstract public int port() ;

    abstract public boolean withScheme();

}

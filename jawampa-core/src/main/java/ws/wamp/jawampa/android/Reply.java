/*
 * Copyright 2014 Matthias Einwag
 *
 * The jawampa authors license this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package ws.wamp.jawampa.android;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Reply
{
	private final JsonArray  arguments;
	private final JsonObject keywordArguments;

	public Reply( JsonArray arguments, JsonObject keywordArguments )
	{
		this.arguments = arguments;
		this.keywordArguments = keywordArguments;
	}

	public JsonArray getArguments()
	{
		return arguments;
	}

	public JsonObject getKeywordArguments()
	{
		return keywordArguments;
	}
}

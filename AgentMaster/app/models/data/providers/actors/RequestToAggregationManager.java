/*  

Copyright [2013-2014] eBay Software Foundation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/
package models.data.providers.actors;

import java.util.Map;

import models.data.AgentCommandMetadata;
import models.data.AggregateData;
import models.data.NodeGroupDataMap;
import models.utils.VarUtils;
/**
 * 
 * @author ypei
 *
 */
public class RequestToAggregationManager {

	public final String patternStr;
	public final String directorJobId;
	public final AggregateData aggregateData;
	public String getPatternStr() {
		return patternStr;
	}
	public String getDirectorJobId() {
		return directorJobId;
	}
	public AggregateData getAggregateData() {
		return aggregateData;
	}
	public RequestToAggregationManager(String patternStr, String directorJobId,
			AggregateData aggregateData) {
		super();
		this.patternStr = patternStr;
		this.directorJobId = directorJobId;
		this.aggregateData = aggregateData;
	}



}

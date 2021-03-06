/**
 * This file is part of Netconf4j.
 *
 * Netconf4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Netconf4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Netconf4j. If not, see <http://www.gnu.org/licenses/>.
 */
package net.i2cat.netconf.rpc;

import java.util.HashMap;

/**
 * Factory class to create base Netconf replies
 * 
 * @author Julio Carlos Barrera
 * 
 */
public class ReplyFactory {

	public static Reply newOk(Query query, HashMap<String, String> attributes) {
		Reply reply = new Reply();
		reply.setMessageId(query.getMessageId());
		reply.setAttributes(attributes);
		reply.setOk(true);
		return reply;
	}

	public static Reply newGetConfigReply(Query query, HashMap<String, String> attributes, String configuration) {
		Reply reply = new Reply();
		reply.setMessageId(query.getMessageId());
		reply.setAttributes(attributes);

		// configuration
		reply.setContain("configuration");
		reply.setContain(configuration);

		return reply;
	}
}

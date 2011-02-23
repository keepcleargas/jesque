/*
 * Copyright 2011 Greg Haines
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.greghaines.jesque.utils;

/**
 * Constants used by Resque.
 * 
 * @author Greg Haines
 */
public interface ResqueConstants
{
	String DATE_FORMAT = "EEE MMM dd yyyy HH:mm:ss 'GMT'Z (z)";
	
	String COLON = ":";
	String FAILED = "failed";
	String PROCESSED = "processed";
	String QUEUE = "queue";
	String QUEUES = "queues";
	String STARTED = "started";
	String STAT = "stat";
	String WORKER = "worker";
	String WORKERS = "workers";
}
/**
 * Copyright (C) 2012-2015 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sybase365.mobiliser.custom.project.businesslogic.exceptions;

/**
 * Lists specific error codes for this customization.
 *
 * @since 2012-01-20
 */
public class StatusCodes {

    // ERROR_CODES//////////////////////////////////////////////////////////////

    /** The error code group for framework errors. */
    private static final int ERROR_GROUP_CUSTOM = 10000;

    /** error codes related to blacklisting */
    private static final int ERROR_GROUP_BLACKLIST = ERROR_GROUP_CUSTOM + 100;

    /** error code for when a name is on the blacklist. */
    public static final int ERROR_NAME_ON_BLACKLIST = ERROR_GROUP_BLACKLIST + 1;
    /** error code for when a similar name is on the blacklist. */
    public static final int ERROR_SIMILAR_NAME_ON_BLACKLIST = ERROR_GROUP_BLACKLIST + 2;
    /** error code when a blacklist entry is not unique. */
    public static final int ERROR_BLACKLIST_NOT_UNIQUE = ERROR_GROUP_BLACKLIST + 3;

    /** error codes related to banking */
    private static final int ERROR_GROUP_BANK = ERROR_GROUP_CUSTOM + 200;

    /** error code when the bank amount differs. */
    public static final int ERROR_BANK_AMOUNT_DIFFERS = ERROR_GROUP_BANK + 1;

}

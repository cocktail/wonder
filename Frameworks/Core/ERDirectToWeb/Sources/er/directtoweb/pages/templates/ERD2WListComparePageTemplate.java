/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb.pages.templates;
import com.webobjects.appserver.WOContext;

import er.directtoweb.pages.ERD2WListComparePage;

/**
 * Basicly a list page flipped vertical.  Useful for comparing from a left to right fashion.<br />
 * @d2wKey componentName
 * @d2wKey hasPrinterFriendlyVersion
 * @d2wKey bannerFileName
 * @d2wKey showBanner
 * @d2wKey emptyListComponentName
 * @d2wKey displayNameForEntity
 * @d2wKey textColor
 * @d2wKey pageWrapperName
 */
public class ERD2WListComparePageTemplate extends ERD2WListComparePage {

    public ERD2WListComparePageTemplate(WOContext context) {super(context);}
}

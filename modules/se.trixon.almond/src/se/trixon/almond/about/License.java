/* 
 * Copyright 2015 Patrik Karlsson.
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
package se.trixon.almond.about;

import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.NbBundle;

/**
 *
 * @author Patrik Karlsson <patrik@trixon.se>
 */
public class License {

    private final LicensePanel mLicensePanel;

    private License(String license) {
        mLicensePanel = new LicensePanel(license);
        showIt();
    }

    private void showIt() {
        String dialogTitle = NbBundle.getMessage(License.class, "CTL_DialogTitleLicense");

        DialogDescriptor dialogDescriptor = new DialogDescriptor(
                mLicensePanel,
                dialogTitle,
                true,
                new Object[]{DialogDescriptor.CLOSED_OPTION},
                DialogDescriptor.CLOSED_OPTION,
                DialogDescriptor.DEFAULT_ALIGN,
                null,
                null);

        DialogDisplayer.getDefault().notify(dialogDescriptor);
    }
}

/*
 * **************************************************-
 * ingrid-interface-search
 * ==================================================
 * Copyright (C) 2014 - 2023 wemove digital solutions GmbH
 * ==================================================
 * Licensed under the EUPL, Version 1.1 or – as soon they will be
 * approved by the European Commission - subsequent versions of the
 * EUPL (the "Licence");
 *
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl5
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * **************************************************#
 */
package de.ingrid.iface.opensearch.model.dcatapde.general;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeriodOfTimeElement {
    // 0..1
    @JacksonXmlProperty(namespace = "http://schema.org/")
    private DatatypeTextElement startDate;

    // 0..1
    @JacksonXmlProperty(namespace = "http://schema.org/")
    private DatatypeTextElement endDate;

    public DatatypeTextElement getStartDate() {
        return startDate;
    }

    public void setStartDate(DatatypeTextElement startDate) {
        this.startDate = startDate;
    }

    public DatatypeTextElement getEndDate() {
        return endDate;
    }

    public void setEndDate(DatatypeTextElement endDate) {
        this.endDate = endDate;
    }
}

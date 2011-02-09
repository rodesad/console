package org.jboss.as.console.client.components;

import com.smartgwt.client.widgets.Label;

/**
 * @author Heiko Braun
 * @date 2/9/11
 */
public class DescriptionLabel extends Label {

    public DescriptionLabel() {
        super();
        setup();
    }

    public DescriptionLabel(String contents) {
        super(contents);
        setup();
    }

    private void setup() {
        setMargin(10);
        setStyleName("description-label");
    }

}

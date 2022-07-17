package com.suvmitra.tube.frontend.ui

import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route

@Route("")
class MainView: VerticalLayout() {

    init {
        val title = H3("SpringTube")
        add(title)
    }
}
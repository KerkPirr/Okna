package com.example.demo1.components.nodes

import com.example.demo1.components.props.StringProp
import javafx.geometry.Point2D

class StringNode(position: Point2D) : BaseGraphNode("String", position) {
    private var mainProp: StringProp = StringProp(hasIn = false, hasOut = true)
    init {
        addProp(mainProp)
    }
}
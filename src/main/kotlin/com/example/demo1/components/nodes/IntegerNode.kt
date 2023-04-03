package com.example.demo1.components.nodes;

import com.example.demo1.components.props.IntegerProp
import javafx.geometry.Point2D

class IntegerNode(position: Point2D) : BaseGraphNode("Integer", position) {
    private var mainProp: IntegerProp = IntegerProp(hasIn = true, hasOut = true)

    init {
        addProp(mainProp)
    }
}
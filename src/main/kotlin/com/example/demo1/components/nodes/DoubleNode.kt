package com.example.demo1.components.nodes

import com.example.demo1.components.props.DoubleProp
import javafx.geometry.Point2D

class DoubleNode(position: Point2D) : BaseGraphNode("Double", position) {
    private var mainProp: DoubleProp = DoubleProp(hasIn = false, hasOut = true)
    init {
        addProp(mainProp)
    }
}
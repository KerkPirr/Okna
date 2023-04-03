package com.example.demo1.components.nodes.imagefilters

import javafx.geometry.Point2D
import org.opencv.core.Core
import org.opencv.core.CvType
import org.opencv.core.Mat

class InvertNode(position: Point2D) :
    FilterNode(position, "Invert Filter") {
    init {
        initPropsListeners()
    }
    override fun filter(mat: Mat): Mat {
        val mat2 = Mat()
        mat.copyTo(mat2)
        Core.bitwise_not(mat, mat2)
        return mat2
    }


}
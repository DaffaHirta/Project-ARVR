package com.example.arvrproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import io.github.sceneview.SceneView
import io.github.sceneview.ar.node.ArModelNode
import io.github.sceneview.node.ModelNode

class MainActivity : AppCompatActivity() {

    lateinit var sceneView: SceneView
    lateinit var placeButton: ExtendedFloatingActionButton
    lateinit var modelNode: ArModelNode



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sceneView = findViewById(R.id.sceneView)

        placeButton = findViewById(R.id.place)


        modelNode = ArModelNode().apply {
            loadModelGlbAsync(
                glbFileLocation = "models/single_spiral_notepad.glb"
            )
            {
                sceneView.planeRenderer.isVisible = true

            }
        }
    }
}
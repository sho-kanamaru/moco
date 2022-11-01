package com.example.moco

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
	@GetMapping("/")
	fun index(model: Model): String {
		return "Hello Kotlin, Hello Docker."
	}
}

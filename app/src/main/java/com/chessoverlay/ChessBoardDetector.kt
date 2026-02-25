package com.chessoverlay

/**
 * Stub temporal para compilar sin OpenCV completo.
 * El módulo :opencv de este repo NO incluye imgproc (Imgproc, MatOfPoint2f, etc),
 * por eso fallaba el build en GitHub Actions.
 *
 * TODO: cuando se integre el OpenCV Android SDK completo, restaurar detección real.
 */
class ChessBoardDetector {

  data class Result(
    val ok: Boolean,
    val message: String = "OpenCV not bundled (stub)"
  )

  fun detect(): Result {
    return Result(ok = false)
  }
}

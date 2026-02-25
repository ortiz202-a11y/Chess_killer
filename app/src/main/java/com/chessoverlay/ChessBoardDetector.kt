package com.chessoverlay

/**
 * STUB temporal para destrabar CI.
 * Compatibilidad:
 *  - ChessBoardDetector()  (instanciación)
 *  - detector.detectBoardAndExtractFEN(...)
 *  - ChessBoardDetector.detectBoardAndExtractFEN(...)
 *
 * OJO: NO usar @JvmStatic aquí, porque choca con el método de instancia
 * (misma firma JVM) y rompe compilación.
 */
class ChessBoardDetector {

  fun detectBoardAndExtractFEN(vararg args: Any?): String? = null

  companion object {
    fun detectBoardAndExtractFEN(vararg args: Any?): String? = null
  }
}

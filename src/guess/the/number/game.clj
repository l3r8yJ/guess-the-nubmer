(ns guess.the.number.game
  (:require [guess.the.number.core :refer :all]))

; Just start of the game
(game (cmp? (user-guess) game-secret))

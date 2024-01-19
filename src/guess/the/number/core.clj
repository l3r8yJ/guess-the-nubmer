(ns guess.the.number.core)

(def game-secret (rand-int 10))

(defn user-guess "reads user guess" []
  (println "Enter your guess, please")
  (try (Integer/parseInt (read-line))
       (catch NumberFormatException _
         (println "Not a number!")
         (user-guess))))

(defn cmp? "compare of guess and secret" [guess secret]
  (let [win "You guessed the number!"
        big "Your number too big!"
        small "Your number too small!"]
    (if (> guess secret) big
      (if (< guess secret) small win))))

(defn game "Guess the number game" [result]
  (let [show-result (println result)]
    (if (not= result "You guessed the number!")
      (do [show-result] (recur (cmp? (user-guess) game-secret))) show-result)))
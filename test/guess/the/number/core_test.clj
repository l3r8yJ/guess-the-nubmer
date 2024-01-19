(ns guess.the.number.core-test
  (:require [clojure.test :refer :all]
            [guess.the.number.core :refer :all]))

(deftest game-secret-test
  (testing "game secret should be between 0 and 10"
    (is (and (<= game-secret 10) (>= game-secret 0)))))

(deftest cmp-test
  (testing "should work correct when guess greater than secret"
    (is (= (cmp? 10 5) "Your number too big!")
        (is (= (cmp? 5 10) "Your number too small!")
            (is (= (cmp? 10 10) "You guessed the number!"))))))

(ns problem100)

(def test-cases
  '[(== (__ 2 3) 6)
    (== (__ 5 3 7) 105)
    (== (__ 1/3 2/5) 2)
    (== (__ 3/4 1/6) 3/2)
    (== (__ 7 5/7 2 3/5) 210)])

(def __
  (fn [& xs]
    (letfn [(gcd [a b]
              (if (zero? b)
                a
                (recur b (mod a b))))
            (lcm [a b]
              (/ (* a b)
                 (gcd a b)))]
      (reduce lcm xs)))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

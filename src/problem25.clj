(ns problem25)

(def test-cases
  '[(= (__ #{1 2 3 4 5}) '(1 3 5))
    (= (__ [4 2 1 6]) '(1))
    (= (__ [2 2 4 6]) '())
    (= (__ [1 1 1 3]) '(1 1 1 3))])

(def __
  (partial filter odd?)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

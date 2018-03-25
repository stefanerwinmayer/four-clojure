(ns problem19)

(def test-cases
  '[(= (__ [1 2 3 4 5]) 5)
    (= (__ '(5 4 3)) 3)
    (= (__ ["b" "c" "d"]) "d")])

(def __
  (comp first reverse)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

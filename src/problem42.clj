(ns problem42)

(def test-cases
  '[(= (__ 1) 1)
    (= (__ 3) 6)
    (= (__ 5) 120)
    (= (__ 8) 40320)])

(def __
  #(reduce * (range 1 (inc %)))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

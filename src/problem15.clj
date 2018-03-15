(ns problem15)

(def test-cases
  '[(= (__ 2) 4)
    (= (__ 3) 6)
    (= (__ 11) 22)
    (= (__ 7) 14)])

(def __
  (partial * 2)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

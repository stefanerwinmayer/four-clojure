(ns problem9)

(def test-cases
  '[(= #{1 2 3 4} (conj #{1 4 3} __))])

(def __
  2
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

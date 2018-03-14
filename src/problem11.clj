(ns problem11)

(def test-cases
  '[(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))])

(def __
  {:b 2}
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

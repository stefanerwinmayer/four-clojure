(ns problem48)

(def test-cases
  '[(= __ (some #{2 7 6} [5 6 7 8]))
    (= __ (some #(when (even? %) %) [5 6 7 8]))])

(def __
  6
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

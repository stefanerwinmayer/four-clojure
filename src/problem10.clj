(ns problem10)

(def test-cases
  '[(= __ ((hash-map :a 10, :b 20, :c 30) :b))
    (= __ (:b {:a 10, :b 20, :c 30}))])

(def __
  20
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

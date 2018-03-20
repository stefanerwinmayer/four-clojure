(ns problem31)

(def test-cases
  '[(= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
    (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
    (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))])

(def __
  #(partition-by identity %)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

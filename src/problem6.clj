(ns problem6)

(def test-cases
  '[(= __
       (list :a :b :c)
       (vec '(:a :b :c))
       (vector :a :b :c))])

(def __
  [:a :b :c]
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))

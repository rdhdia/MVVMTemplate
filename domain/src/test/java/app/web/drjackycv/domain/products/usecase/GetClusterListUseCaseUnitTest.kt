package app.web.drjackycv.domain.products.usecase

import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetClusterListUseCaseUnitTest {

    /*private lateinit var getClusterListUseCase: GetClusterListUseCase

    @Mock
    private lateinit var productsRepository: ProductsRepository

    @Before
    fun setUp() {
        getClusterListUseCase = GetClusterListUseCase(productsRepository)
    }

    @Test
    fun `invoke should return list of clusters`() {
        whenever(productsRepository.getClusters())
            .doReturn(getSingleSuccess(providesClusters()))

        val testObserver = getClusterListUseCase(Unit).testAwait()

        testObserver.assertGeneralsSuccess {
            it.clusters.isNotEmpty()
        }
    }

    @Test
    fun `invoke should not return list of clusters in case of an error`() {
        whenever(productsRepository.getClusters())
            .doReturn(getSingleError())

        val testObserver = getClusterListUseCase(Unit).testAwait()

        testObserver.assertGeneralsError()
    }*/

}
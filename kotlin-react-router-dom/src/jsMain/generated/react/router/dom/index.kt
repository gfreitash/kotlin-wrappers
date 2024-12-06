// Generated by Karakum - do not modify it manually!

@file:JsModule("react-router-dom")

package react.router.dom

/**
 * NOTE: If you refactor this to split up the modules into separate files,
 * you'll need to update the rollup config for react-router-dom-v5-compat.
 */


/* export type { FormEncType, FormMethod, GetScrollRestorationKeyFunction, ParamKeyValuePair, SubmitOptions, URLSearchParamsInit, V7_FormMethod, }; */

/* export { createSearchParams, ErrorResponseImpl as UNSAFE_ErrorResponseImpl }; */

/* export type { ActionFunction, ActionFunctionArgs, AwaitProps, Blocker, BlockerFunction, DataRouteMatch, DataRouteObject, DataStrategyFunction, DataStrategyFunctionArgs, DataStrategyMatch, DataStrategyResult, ErrorResponse, Fetcher, FutureConfig, Hash, IndexRouteObject, IndexRouteProps, JsonFunction, LazyRouteFunction, LayoutRouteProps, LoaderFunction, LoaderFunctionArgs, Location, MemoryRouterProps, NavigateFunction, NavigateOptions, NavigateProps, Navigation, Navigator, NonIndexRouteObject, OutletProps, Params, ParamParseKey, PatchRoutesOnNavigationFunction, PatchRoutesOnNavigationFunctionArgs, Path, PathMatch, Pathname, PathParam, PathPattern, PathRouteProps, RedirectFunction, RelativeRoutingType, RouteMatch, RouteObject, RouteProps, RouterProps, RouterProviderProps, RoutesProps, Search, ShouldRevalidateFunction, ShouldRevalidateFunctionArgs, To, UIMatch, } from "react-router"; */

/* export { AbortedDeferredError, Await, MemoryRouter, Navigate, NavigationType, Outlet, Route, Router, Routes, createMemoryRouter, createPath, createRoutesFromChildren, createRoutesFromElements, defer, isRouteErrorResponse, generatePath, json, matchPath, matchRoutes, parsePath, redirect, redirectDocument, replace, renderMatches, resolvePath, useActionData, useAsyncError, useAsyncValue, useBlocker, useHref, useInRouterContext, useLoaderData, useLocation, useMatch, useMatches, useNavigate, useNavigation, useNavigationType, useOutlet, useOutletContext, useParams, useResolvedPath, useRevalidator, useRouteError, useRouteLoaderData, useRoutes, } from "react-router"; */

/** @internal */
/* export { UNSAFE_DataRouterContext, UNSAFE_DataRouterStateContext, UNSAFE_NavigationContext, UNSAFE_LocationContext, UNSAFE_RouteContext, UNSAFE_useRouteId, } from "react-router"; */

/* declare global {
    var __staticRouterHydrationData: HydrationState | undefined;
    var __reactRouterVersion: string;
    interface Document {
        startViewTransition(cb: () => Promise<void> | void): ViewTransition;
    }
} */

external val ViewTransitionContext: react.Context<ViewTransitionContextObject>

/* export { ViewTransitionContext as UNSAFE_ViewTransitionContext }; */

external val FetchersContext: react.Context<FetchersContextObject>

/* export { FetchersContext as UNSAFE_FetchersContext }; */


/* export { HistoryRouter as unstable_HistoryRouter }; */

/**
 * The public API for rendering a history-aware `<a>`.
 */
external val Link: react.FC<LinkProps>

/**
 * A `<Link>` wrapper that knows if it's "active" or not.
 */
external val NavLink: react.FC<NavLinkProps>

/**
 * A `@remix-run/router`-aware `<form>`. It behaves like a normal form except
 * that the interaction with the server is with `fetch` instead of new document
 * requests, allowing components to add nicer UX to the page as the form is
 * submitted and returns with data.
 */
external val Form: react.FC<FormProps>


/* export { useScrollRestoration as UNSAFE_useScrollRestoration }; */

/* export { usePrompt as unstable_usePrompt }; */

/* export { useViewTransitionState as useViewTransitionState }; */
